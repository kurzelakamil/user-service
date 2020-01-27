package pl.kurzelakamil.bettingapp.userservice.dto.transfer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RejectUserTransferObject {

    private HeaderDto header;
    private Long id;
    private RejectionReason rejectionReason;

    private enum RejectionReason{
        USER_ALREADY_EXISTS;
    }

    public void setUserAlreadyExistsReason(){
        this.rejectionReason = RejectionReason.USER_ALREADY_EXISTS;
    }
}
