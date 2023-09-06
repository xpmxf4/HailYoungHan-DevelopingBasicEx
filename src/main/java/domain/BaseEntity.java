package domain;

import java.time.LocalDateTime;

public abstract class BaseEntity {
    private String createdBy;
    private LocalDateTime createdTime;
    private LocalDateTime modifiedBy;
    private LocalDateTime modifiedTime;
}
