package helloworld.liquidaciondiversos;

import lombok.Data;

@Data
public class Warranty {
    private String code;
    private String name;
    private WarrantyType warrantyType;
}
