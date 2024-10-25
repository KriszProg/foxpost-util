package hu.foxpost.util.dto;

import java.util.List;
import java.util.Objects;

public class ParcelsBySenderDto {

    private ClientDto sender;
    private List<ParcelBaseDto> parcels;

    public ParcelsBySenderDto() {}

    public ParcelsBySenderDto(ClientDto sender, List<ParcelBaseDto> parcels) {
        this.sender = sender;
        this.parcels = parcels;
    }

    public ClientDto getSender() {
        return sender;
    }

    public ParcelsBySenderDto sender(ClientDto sender) {
        this.sender = sender;
        return this;
    }

    public List<ParcelBaseDto> getParcels() {
        return parcels;
    }

    public ParcelsBySenderDto parcels(List<ParcelBaseDto> parcels) {
        this.parcels = parcels;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ParcelsBySenderDto that = (ParcelsBySenderDto) object;
        return Objects.equals(sender, that.sender)
                && Objects.equals(parcels, that.parcels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, parcels);
    }

    @Override
    public String toString() {
        return "ParcelsBySenderDto{" +
                "sender=" + sender +
                ", parcels=" + parcels +
                '}';
    }

}
