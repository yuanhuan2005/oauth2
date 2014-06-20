package com.rideo.app.oauth2.domain;

public class User extends AbstractDomain
{
    private static final long serialVersionUID = 1L;

    private String userId;
    private String username;
    private String nickname;
    private String userImage;
    private int age;
    private int gender;
    private String phoneNumber;
    private String email;
    private String userType;
    private String thirdPartyUserId;
    private String registerDate;
    private String password;

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public String getUserImage()
    {
        return userImage;
    }

    public void setUserImage(String userImage)
    {
        this.userImage = userImage;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getGender()
    {
        return gender;
    }

    public void setGender(int gender)
    {
        this.gender = gender;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getUserType()
    {
        return userType;
    }

    public void setUserType(String userType)
    {
        this.userType = userType;
    }

    public String getThirdPartyUserId()
    {
        return thirdPartyUserId;
    }

    public void setThirdPartyUserId(String thirdPartyUserId)
    {
        this.thirdPartyUserId = thirdPartyUserId;
    }

    public String getRegisterDate()
    {
        return registerDate;
    }

    public void setRegisterDate(String registerDate)
    {
        this.registerDate = registerDate;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "User [userId=" + userId + ", username=" + username + ", nickname=" + nickname
                + ", userImage=" + userImage + ", age=" + age + ", gender=" + gender
                + ", phoneNumber=" + phoneNumber + ", email=" + email + ", userType=" + userType
                + ", thirdPartyUserId=" + thirdPartyUserId + ", registerDate=" + registerDate
                + ", password=" + password + "]";
    }

}