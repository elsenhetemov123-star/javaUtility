package Enum_Tasks;

public enum OrderStatus {
    NEW("False"), PROCESSING("False"), SHIPPED("False"), DELIVERED("True"), CANCELED("True");
    String description;

    OrderStatus(String description) {
        this.description = description;
    }

    boolean isFinalStatus() {
        return this == DELIVERED || this == CANCELED;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static OrderStatus fromString(String status) {
        if (status == null) {
            throw new IllegalArgumentException("Status bos ola bilmez");

        }
        return OrderStatus.valueOf(status.toUpperCase());


    }
}