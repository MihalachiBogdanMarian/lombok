import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user); // converts from User to UserCommand

    User userCommandToUser(UserCommand userCommand); // converts from UserCommand to User
}
