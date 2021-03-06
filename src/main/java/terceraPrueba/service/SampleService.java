package terceraPrueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import terceraPrueba.repository.SampleRepository;

@Service
public class SampleService {

    @Autowired
    private SampleRepository sampleRepository;

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public String welcome(String userName) {
        return sampleRepository.getMessageByUser(userName);
    }

}