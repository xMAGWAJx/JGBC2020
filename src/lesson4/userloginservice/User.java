package lesson4.userloginservice;

public class User {

  private String login;
  private String password;
  private boolean userIsBloocked;
  private int numberOfAttempts;

  public User(String login, String password) {
    this.login = login;
    this.password = password;
  }

  public void login () {

  }

  public void resetnumberOfAttempts() {

  }

  public void blockUser() {

  }
}



/*
*
*
* Описание:
Необходимо разработать программу, которая проверяет, можно ли пользователю войти в свою учетную запись ("логин").

Функциональные требования:
Программа должна состоять из 2-х базовых компонентов: User и UserLoginService.

Класс User должен представлять сущность пользователя и обладать следующими характеристиками:

Свойства

Логин
Пароль
Заблокирован ли пользователь
Количество попыток для входа в учетную запись, до блокировки пользователя (по-умолчанию максимальное количество попыток равно 3)
Методы

Сбросить количество попыток входа
Заблокировать пользователя
Класс UserLoginService должен представлять сервис для выполнения логики со сравнением и обладать следующими характеристиками:

Методы

Операция для входа в учетную запись boolean login(User user, String password). Метод должен возвращать true если введеный пароль совпадает с паролем пользователя, а также сбрасывать кол-во попыток на вход, если пользователь не заблокирован. Метод должен возвращать false если пароли не совпадают, а также уменьшить кол-во попыток на вход и заблокировать пользователя, если кол-во попыток исчерпано.
Нефункциональные требования:
Продемонстрировать работу классов (см. пример) в классе UserLoginServiceDemo.

Опционально: Написать тестовые сценарии для класса User в UserTest и UserLoginService в классе UserLoginServiceTest. Все тестовые сценарии должны отрабатывать без ошибок.

Результат:
Загрузить файлы User.java, UserTest.java, UserLoginService.java UserLoginServiceTest.java, UserLoginServiceDemo.java в одном архиве (*.zip, *.rar)

Пример:
UserLoginService service = new UserLoginService();
User userOne = new User("user-login", "user-password");
​
service.login(userOne, "user-password-12345"); //Should return false
service.login(userOne, "user-password"); //Should return true
*
* */