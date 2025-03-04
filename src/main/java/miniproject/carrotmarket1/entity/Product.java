package miniproject.carrotmarket1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private String location;
    private Double latitude;
    private Double longitude;
    private Long categoryId;
    private Timestamp createdAt;
    private Long userId;
    private String status;
    private String usedYn;
    private int totalCount;

    // Google Maps API를 통해 계산된 이동 시간 정보
    private String drivingTime;    // 차량으로 걸리는 시간

    // 관계 매핑
    private User user;
    private Category category;
    private List<ProductImage> images;
}
