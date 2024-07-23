package arbeitnow.com.entity;

import java.time.Instant;
import java.util.List;

public class Data {
    private String slug;
    private String companyName;
    private String tittle;
    private String description;
    private Boolean remote;
    private List<String> tags;
    private List<String> jobType;
    private String location;
    private Instant createAt;
}
