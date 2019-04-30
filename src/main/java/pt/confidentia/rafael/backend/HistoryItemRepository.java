package pt.confidentia.rafael.backend;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import pt.confidentia.rafael.backend.data.entity.HistoryItem;

@Repository
public interface HistoryItemRepository extends EntityRepository<HistoryItem, Long> {
}
