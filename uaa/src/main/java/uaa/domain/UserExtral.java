package uaa.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class UserExtral implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;

    @Column(name = "phone")
    private String phone;

    @OneToOne
    @MapsId
    private User user;
}
