package techsuppDev.techsupp.DTO;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NoticeDTO {

    private Long noticeId;
    private String noticeWriter;
    private String noticeTitle;
    private String noticeContents;
    private int noticeHits;
    private LocalDateTime noticeregDate;
    private LocalDateTime noticemodDate;


}
