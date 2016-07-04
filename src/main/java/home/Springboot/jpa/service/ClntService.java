package home.Springboot.jpa.service;

import home.Springboot.jpa.domain.Clnt;
import home.Springboot.jpa.domain.ClntIdentification;
import home.Springboot.jpa.repository.ClntIdentificationRepository;
import home.Springboot.jpa.repository.ClntRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by amuu4 on 03-07-2016.
 */
@RestController
public class ClntService {

    private final Logger log = LoggerFactory.getLogger(ClntService.class);

    @Autowired
    private EntityManager em;

    @Autowired
    private ClntRepository clntRepository;

    @Autowired
    private ClntIdentificationRepository clntIdentificationRepository;

    @RequestMapping(value = "/clnt", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Clnt> create(@RequestBody Clnt clnt, HttpStatus status) throws URISyntaxException{
        log.info("Requesting to create Client");
        ClntIdentification i = clnt.getClntIdentification();
        BigDecimal key1 = (BigDecimal) clntRepository.getnextval();
        String key2 = String.valueOf(key1);
        Long key = Long.valueOf(key2);
        clnt.setSystemclientid(key);
        i.setSystemclient(key);
        log.info("Getting and setting sequence id {}", +key);
        Clnt result = clntRepository.save(clnt);
        log.info("Creating client record {}"+clnt);
        if(i.getCif() != null){
            createidentification(i);
            log.info("Creating client Identification Record {} ", i.toString());
        }

        return ResponseEntity.created(new URI("new/clnt/"+result.getSystemclientid())).body(result);
    }

    //Method to write Client identification data to DB
    @RequestMapping(value="/clntidentification", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClntIdentification> createidentification(@RequestBody ClntIdentification clntIdentification) throws URISyntaxException {
        ClntIdentification res = clntIdentificationRepository.save(clntIdentification);
        return null;

    }

    //Efficient way, Helps in paging
    /*@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Clnt> getall(Pageable pageable) throws URISyntaxException{
     //   List<Clnt> data = clntRepository.findAll();
        Page<Clnt> page= clntRepository.findAll(pageable);
        return new ResponseEntity(page.getContent(),HttpStatus.OK);
    }*/

    @RequestMapping(value = "/clients", method =  RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Clnt> getallclients(){
        List<Clnt> cl = clntRepository.findAll();
        return cl;
    }
}
