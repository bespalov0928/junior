package ru.job4j.ex;

/**
 * class UserStore ищет пользователя  и проверяет имя на корректность
 */
public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                user = users[index];
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("Element not found.");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean valid = true;
        if (!user.isValid()) {
            valid = false;
            throw new UserInvalidException("User not validate");
        }
        if (user.getUsername().length() < 3) {
            valid = false;
            throw new UserInvalidException("User name less 3");
        }
        return valid;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ue) {
            ue.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
