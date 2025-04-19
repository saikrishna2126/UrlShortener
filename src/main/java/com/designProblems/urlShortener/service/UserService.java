@Service
class UserService {
     @Autowired
     private UserTableRepository userTableRepository;
     public String getuser(long id){
        optional<UserTable> userName = userTableRepository.findById(id);
        if(userName.isPresent()){
            return userName.get().getUserName();
     }
}