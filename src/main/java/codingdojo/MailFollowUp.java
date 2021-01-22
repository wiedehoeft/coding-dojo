package codingdojo;

import java.time.LocalDateTime;

public interface MailFollowUp {

    LocalDateTime followupZeitpunkt(LocalDateTime now, String emailadresse);
}
