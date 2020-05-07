/**
 * 鍩庡競鎻忚堪瀵硅薄
 *
 * @ClassName: City
 * @Description: 鍩庡競鎻忚堪瀵硅薄
 * @author: Bruce Young
 * @date: 2020骞�02鏈�02鏃� 17:48
 */
public class City {
    private int centerX;
    private int centerY;
    //add a new 注释in here

    public City(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }
}
