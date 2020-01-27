package pl.kurzelakamil.bettingapp.userservice.dto.transfer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApproveUserTransferObject {

    private HeaderDto header;
    private Long id;
}
