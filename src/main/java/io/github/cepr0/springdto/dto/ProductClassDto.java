package io.github.cepr0.springdto.dto;

import io.github.cepr0.springdto.domain.Product;
import lombok.Data;
import org.springframework.hateoas.core.Relation;

/**
 * @author Cepro
 * @since 2017-07-22
 */
@Data
@Relation(value = "product", collectionRelation = "products")
public class ProductClassDto implements ProductInterfaceDto {
    
    private final String name;
    
    public ProductClassDto(Product product) {
        this.name = product.getName();
    }
}