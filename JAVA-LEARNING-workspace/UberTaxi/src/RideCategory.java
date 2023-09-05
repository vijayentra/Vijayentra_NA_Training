public class RideCategory {
private String categoryName;
    private float fareMultiplier;

    public RideCategory(String categoryName, float fareMultiplier) {
        this.categoryName = categoryName;
        this.fareMultiplier = fareMultiplier;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public float getFareMultiplier() {
        return fareMultiplier;
    }
}

