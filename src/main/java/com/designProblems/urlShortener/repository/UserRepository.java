@Repository
interface UserRepository implements JpaRepository<UserTable, Long>{
    public UserTable findById(long id)
}