package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Anime {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @SequenceGenerator(
            name="anime_sequence",
            sequenceName="anime_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "anime_sequence"
    )
    private Long id;
    private String name;
}
