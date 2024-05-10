package ryanwallerius.recipebuilder.Dto;

public class UpdateResponseDto<T> {
    private T object;
    private int changeCount;

    public UpdateResponseDto(T data, int changeCount) {
        this.object = data;
        this.changeCount = changeCount;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public int getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(int changeCount) {
        this.changeCount = changeCount;
    }
}