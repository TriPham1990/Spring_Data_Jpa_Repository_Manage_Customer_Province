package tri.lo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import tri.lo.model.Province;

public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}
