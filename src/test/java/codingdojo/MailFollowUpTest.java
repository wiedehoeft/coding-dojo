package codingdojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 7days@followup.cc
 * Ab jetzt in 7 Tagen.
 * 12hours@followup.cc
 * Ab jetzt in 12 Stunden.
 * aug15-9am@followup.cc
 * Am nächsten 15. August um 9 Uhr.
 * 1week3days5hours@followup.cc
 * Ab jetzt in einer Woche, drei Tagen und fünf Stunden.
 */
class MailFollowUpTest {

  private MailFollowUpImpl sut;

  @BeforeEach
  void SetUp() {
    sut = new MailFollowUpImpl();
  }

}
