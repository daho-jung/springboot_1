package mrs.domain.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

@Embeddable
public class ReservableRoomId implements Serializable{
	private Integer roomId;
	private LocalDate reservedDate;
	
	public ReservableRoomId(Integer rid, LocalDate rdate) {
		this.roomId = rid;
		this.reservedDate = rdate;
	}
	
	public ReservableRoomId() {
		
	}
	
	public int hashCode() {
		final int prime=31;
		int res = 1;
		res = prime*res + ((reservedDate==null)? 0:reservedDate.hashCode());
		res = prime*res +((roomId==null)? 0:roomId.hashCode());
		return res;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		ReservableRoomId other = (ReservableRoomId) obj;
		if(this.reservedDate == null) {
			if(other.reservedDate != null)
				return false;
		}else if(!reservedDate.equals(other.reservedDate)){
			return false;
		}
		if(roomId == null) {
			if(other.roomId != null) {
				return false;
			}else if(!roomId.equals(other.roomId))
				return false;
		}
					
		return true;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public LocalDate getReservedDate() {
		return reservedDate;
	}

	public void setReservedDate(LocalDate reservedDate) {
		this.reservedDate = reservedDate;
	}
	
	
}
