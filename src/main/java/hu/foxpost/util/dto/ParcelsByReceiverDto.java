package hu.foxpost.util.dto;

import java.util.List;
import java.util.Objects;

public class ParcelsByReceiverDto {

    private ClientDto receiver;
    private List<ParcelBaseDto> parcels;

    public ParcelsByReceiverDto() {}

    public ParcelsByReceiverDto(ClientDto receiver, List<ParcelBaseDto> parcels) {
        this.receiver = receiver;
        this.parcels = parcels;
    }

    public ClientDto getReceiver() {
        return receiver;
    }

    public ParcelsByReceiverDto receiver(ClientDto receiver) {
        this.receiver = receiver;
        return this;
    }

    public List<ParcelBaseDto> getParcels() {
        return parcels;
    }

    public ParcelsByReceiverDto parcels(List<ParcelBaseDto> parcels) {
        this.parcels = parcels;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ParcelsByReceiverDto that = (ParcelsByReceiverDto) object;
        return Objects.equals(receiver, that.receiver)
                && Objects.equals(parcels, that.parcels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiver, parcels);
    }

    @Override
    public String toString() {
        return "ParcelsByReceiverDto{" +
                "receiver=" + receiver +
                ", parcels=" + parcels +
                '}';
    }

}
