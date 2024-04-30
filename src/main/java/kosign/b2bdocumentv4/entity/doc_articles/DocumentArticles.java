package kosign.b2bdocumentv4.entity.doc_articles;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import kosign.b2bdocumentv4.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doc_articles", schema = "stdy")
public class DocumentArticles extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long tag_id;
    private String title;

    private String content_body;
    @NotNull
    private Long user_id;
    @NotNull
    private Long status;
    @NotNull
    private String file_article_id;
    private String dept_id;
    @NotNull
    private String isfavorite;
    @NotNull
    private String tag_title; //added
}
