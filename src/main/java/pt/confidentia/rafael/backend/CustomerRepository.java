package pt.confidentia.rafael.backend;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import pt.confidentia.rafael.backend.data.entity.Customer;

@Repository
public interface CustomerRepository extends EntityRepository<Customer, Long> {
}
