@Entity
@Table(name="usertable")
class UserTable{
    @Id
    @GeneratedValue(strategy = GeneratedValueType.Identity)
    private long id;
    private String username;
}