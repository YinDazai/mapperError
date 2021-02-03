package terceraPrueba.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import terceraPrueba.service.SampleService;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @RequestMapping(value = "/welcome/{userName}", method = RequestMethod.GET)
    public String welcome(
            @PathVariable("userName") String userName
    ) 
    {
        return sampleService.welcome(userName);
    }
}