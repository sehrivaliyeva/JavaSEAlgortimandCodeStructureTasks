package buildingtask;

public abstract class Base {
    private int id;
    private int roomCount;
    private String type;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0 && id != 0) {
            this.id = id;
        }
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        if (roomCount > 2) {
            this.roomCount = roomCount;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null && !type.isEmpty()) {
            this.type = type;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0 && price != 0) {
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", roomCount=" + roomCount +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
