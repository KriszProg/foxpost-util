package hu.foxpost.util.dto;

import java.util.Objects;

public class ParcelBaseDto {

    private int id;
    private String parcelNo;

    public ParcelBaseDto() {}

    public ParcelBaseDto(int id, String parcelNo) {
        this.id = id;
        this.parcelNo = parcelNo;
    }

    public int getId() {
        return id;
    }

    public ParcelBaseDto id(int id) {
        this.id = id;
        return this;
    }

    public String getParcelNo() {
        return parcelNo;
    }

    public ParcelBaseDto parcelNo(String parcelNo) {
        this.parcelNo = parcelNo;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ParcelBaseDto that = (ParcelBaseDto) object;
        return id == that.id
                && Objects.equals(parcelNo, that.parcelNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parcelNo);
    }

    @Override
    public String toString() {
        return "ParcelBaseDto{" +
                "id=" + id +
                ", parcelNo='" + parcelNo + '\'' +
                '}';
    }

}
