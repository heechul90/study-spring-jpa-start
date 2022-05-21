package study.jpashopstart.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    private String createdBy;
    private LocalDateTime createdDate;
    private String lastModifiedBy;
    private LocalDateTime lastModifiedDate;

    public void CreatedInfo(String createdBy, LocalDateTime createdDate) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public void LastModifiedInfo(String lastModifiedBy, LocalDateTime lastModifiedDate) {
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
    }
}
