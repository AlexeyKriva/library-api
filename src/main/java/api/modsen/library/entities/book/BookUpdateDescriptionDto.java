package api.modsen.library.entities.book;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import static api.modsen.library.config.LibraryAppConstants.BLANK_DESCRIPTION_MESSAGE;
import static api.modsen.library.config.LibraryAppConstants.MAX_LENGTH_OF_BOOK_DESCRIPTION;

@Setter
@Getter
public class BookUpdateDescriptionDto {
    @JsonProperty("description")
    @NotBlank(message = BLANK_DESCRIPTION_MESSAGE)
    @Size(max = MAX_LENGTH_OF_BOOK_DESCRIPTION)
    private String description;
}