package lesson4.userloginservice;

public class User {

  private String login;
  private String password;
  private boolean userIsBlocked;
  private int numberOfAttempts;

  public String getLogin() {
    return login;
  }

  public User(String login, String password) {
    this.login = login;
    this.password = password;

  }

  public void resetNumberOfAttempts() {

  }

  public void blockUser() {

  }
}



/*
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


* */