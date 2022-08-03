# Log-in-using-CSSSelector-innerText
Assignment 4 W9D3 - SDA - Software QA Bootcamp


## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)

---
## Question
Goto Facebook.com and using CSS selector with Inner text method to navigate to an Instagram page and mimic the login behavior
- STEP 1: Go to Facebook.com and click on Instagram at the bottom
- STEP 2: Right-click on the username field and click on Inspect for the HTML code
- STEP 3: With the help of inspecting locator using CSSSelector with innerText method
- STEP 4: Same way, complete the full flow of the login on instagram.com


## Answer

I used a ["Facebook"](https://www.facebook.com/)
And Before running the code, there are some steps that need to take considered:


### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I opened the website, then take web elements, and then add them to the code I use cssSelector with inner text as syntax:
`HTMLtag[attribute*=sub string]`.
And cssSelector with multiple attributes as syntax: `HTMLtag[attribute=value][attribute=value]` .

The cssSelector I wrote it are:
- Instagram Text
```md
a[title*='Instagram']
```

- Username TextField
```md
input[aria-label*='number,']
```
- Password TextField
```md
input[class*='pexuQ'][name='password']
```
- Login Button
```md
button[class*='L3NKy']
```

<p align="center">
- Facebook Page
<img src="https://user-images.githubusercontent.com/48597284/182659064-e0abe25d-8fdf-4d6f-88fd-f48d77acd889.png" width=60% height=60%>
- Instagram Page
<img src="https://user-images.githubusercontent.com/48597284/182501619-3c9ac981-875c-403f-ac8b-ddf051d25a5a.png" width=60% height=60%>
</p>

---
## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182659594-83d1e7c5-7932-43b4-9748-3e05aa2fd83d.png" width=80% height=80%>

https://user-images.githubusercontent.com/48597284/182659557-d3b08075-6ea0-487a-8916-08cd2dc3fdfd.mp4
</p>
