@US_102
Feature:As a user; I must be able to perform an appointment reschedule
  Background:
    Given User goes to the "https://test.hypnotes.net/login"
    When user types "therapisthypnotes2020@gmail.com" to the email input on the login page
    When user types "Therapist+tayfa2022" to the password input on the login page.us102
    When User is logged in and in the calender under scheduling "https://test.hypnotes.net/dashboard/calendar".


  @US_102_TC_001_RescheduleAMeeting
  Scenario:US_102_TC_001  As a user; I must be able to perform an appointment reschedule
    Then user clicks on a meeting
    Then user clicks on "Reschedule Appointment"
    Then user selects the "date" and "time"
    Then user click on "Confirm Meeting"
    Then user confirms Next button is clickable
    Then user clicks on Next button
    Then user confirm the Confirmation line should be entered
    Then user checks if the Confirm Meeting Details visible
    Then user clicks on Do not notify client checkbox
    #Then user click on Reschedule without asking for user's permission checkbox
    #BU USTTEKI BASAMAK CALISYOR FAKAT CALISTIRMIYORUZ CALISTIRIRSAK MEVCUT ESKI MEETINGMIZ SILINIR VE YENIDEN GIRIS YAPAMAYIZ
    #FAIL EDER ,ACCEPTANCE CRITERIA DA OLDUGU ICIN HAZIRLANDI VE CONTROL EDILDI CALISIYOR
    #Step definitonsta da ve settingsPage de icinde onlerini kapattildi
    Then user confirms Submit button is clickable.
    Then user clicks on Submit button.
    Then user should be able to pass the Details line.
    Then user checks if the Successfully created a meeting with visible.
    Then user confirms Close button is clickable.
    Then user clicks on Close button.
    Then user checks if the Meet info menu is visible and updated
    Then user checks if user can leave the Meet info menu
    Then user checks if the rescheduled meeting is updated on the calendar
    Then user cancel the reSchduleOne
    #YENI RESCHEDULEYI1 CANCEL EDIYORUZ, YENIDEN AYNI GUN VE SAATTE BOSLUK OLABILSIN


  @US_102_TC_002_BookAnOtherAppointment
  Scenario:US_102_TC_002  As a user; I must be verifies Book another appointment button is functional
    Given User creates a reschedule meeting
    Then  User   verifies theBook another appointment button is clickable
    Then  user clicks on the Book another appointment button
    Then  User Should be visible  on Reschedule Meeting Calendar
    Then user cancel the reSchduleTwo