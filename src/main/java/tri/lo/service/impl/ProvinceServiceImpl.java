package tri.lo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tri.lo.model.Province;
import tri.lo.repository.ProvinceRepository;
import tri.lo.service.ProvinceService;

public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.delete(id);
    }
}
