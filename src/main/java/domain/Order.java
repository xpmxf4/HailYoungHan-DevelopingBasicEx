package domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class Order {
    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;
    @ManyToOne
    private Member member;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
    @Column(name = "ORDERDATE")
    private LocalDateTime orderDate;
    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
