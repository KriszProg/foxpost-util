package hu.foxpost.util.dto;

import java.util.List;
import java.util.Objects;

public class ParcelWithTrackingEventsDto {

    private ParcelDto parcel;
    private List<TrackingEventDto> events;

    public ParcelWithTrackingEventsDto() {}

    public ParcelWithTrackingEventsDto(ParcelDto parcel, List<TrackingEventDto> events) {
        this.parcel = parcel;
        this.events = events;
    }

    public ParcelDto getParcel() {
        return parcel;
    }

    public ParcelWithTrackingEventsDto parcel(ParcelDto parcel) {
        this.parcel = parcel;
        return this;
    }

    public List<TrackingEventDto> getEvents() {
        return events;
    }

    public ParcelWithTrackingEventsDto events(List<TrackingEventDto> events) {
        this.events = events;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ParcelWithTrackingEventsDto that = (ParcelWithTrackingEventsDto) object;
        return Objects.equals(parcel, that.parcel)
                && Objects.equals(events, that.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parcel, events);
    }

    @Override
    public String toString() {
        return "ParcelWithTrackingEventsDto{" +
                "parcel=" + parcel +
                ", events=" + events +
                '}';
    }

}
