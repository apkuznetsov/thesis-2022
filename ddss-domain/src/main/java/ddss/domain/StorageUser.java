package ddss.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "StorageUser")
@Getter
@Setter
public class StorageUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "about")
    private String about;
    @Column(name = "ipAddress", nullable = false)
    private String ipAddress;
    @Column(name = "port", nullable = false)
    private int port;
    @Column(name = "availableMegabytesNumber", nullable = false)
    private long availableMegabytesNumber;

    public StorageUser() {
    }
}
