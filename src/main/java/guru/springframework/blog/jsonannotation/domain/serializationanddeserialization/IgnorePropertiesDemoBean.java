package guru.springframework.blog.jsonannotation.domain.serializationanddeserialization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"userId", "gender"})
public class IgnorePropertiesDemoBean {
    public long  userId = 0;
    public String  name = null;
    public String  gender  = null;
}
