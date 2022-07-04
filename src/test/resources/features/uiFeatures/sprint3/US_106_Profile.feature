#US_106 As a user (Therapist), I should be able to see various information on the profile page
#   Acceptance Criteria
#    Profile
# On your profile page, the About heading and 'Please write something about you to get to know you.' text is visible
# Profile information of the therapist should be visible
# Educations, Experiences, Specialties & Certifications, Your Company titles must be visible
# When the page is loaded, the Educations section should be open and the Add New Education button should be visible
# previously added Educations should be visible when entering the page
# Add New Education button should be clickable
#  KemalD

#Profil sayfanızda, Hakkında başlığı ve 'Lütfen sizi tanımak için hakkınızda bir şeyler yazın.' metin görünür

#Terapistin profil bilgileri görünür olmalıdır

#Eğitimler, Deneyimler, Uzmanlıklar ve Sertifikalar, Şirket unvanlarınız görünür olmalıdır

#Sayfa yüklendiğinde Eğitimler bölümü açık olmalı ve Yeni Eğitim Ekle butonu görünür olmalıdır.

#daha önce eklenen Eğitimler sayfaya girilirken görünmelidir

#Yeni Eğitim Ekle düğmesi tıklanabilir olmalıdır

Feature: As a user (Therapist), I should be able to see various information on the profile page

  Background: The user is on the Home Page
    Given the user lands on home page
    When the user clicks on login button on the homepage
    And  the user enters valid Email "therapisthypnotes2020@gmail.com"
    And  the user enters a valid password "Therapist+tayfa2022"
    Then the user clicks the login Button

  Scenario: The therapist user should be able to see various information on their profile page

    Given the user clicks the "Profile" Button
    Then  the user verifies "Your Profile" heading and "Please write something about you to get to know you." text is visible
    And   the user verifies "Name" and "Email" Profile information of the therapist should be visible
    Then  the user verifies that "Educations" button is visible
    Then  the user verifies that "Experiences" button is visible
    Then  the user verifies that "Specialties & Certifications" button is visible
    Then  the user verifies that "Your Company" button is visible
    When  the page is loaded, the "Educations" section should be open and the "Add New Education" button should be visible
    And   the user previously "added Educations" should be visible when entering the page
    And   the user verifies that "Add New Education" button should be clickable

