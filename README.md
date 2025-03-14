# Skill Builder 4 - Designing and Implementing Finite State Machines

At the end of this Skill Builder, a studnet will be able to:
- Design an FSMs
- Apply process to convert an FSM to code
- Implement an FSM in a function


## Designing and Implementing an FSM

Design a finite-state machine that determines whether a string contains a sub-string that begins with a
<span style="color:rgb(172,86,0);">**t**</span> or <span style="color:rgb(172,86,0);">**T**</span> and ends
with a <span style="color:rgb(172,86,0);">**y**</span> or <span style="color:rgb(172,86,0);">**Y**</span>.  
The sub-string may appear anywhere inside the string.  For example,

```
Hello, my name is Tom Brady and I am thirsty.
```

contains two sub-string that start with a **t** and end in a **y**.
<p style="font-family: 'courier new', monospace;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:blue;font-weight:bold;">
Hello, my name is <span style="color:red;">Tom Brady</span> and I am <span style="color:red;">thirsty</span>.
<p>
Also,

```
Jasmine was rather terribly insulting!
```

contains a sub-string that starts with a **t** in the word **rather** and ends in a **y** in the word **terribly**.
<p style="font-family: 'courier new',monospace;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:blue;font-weight:bold;">Jasmine was ra<span style="color:#ff0000;">ther terribly</span> insulting!
</p>

Use software to draw the FSM.  Any online solution will work as long as you can save it as a pdf (see [draw.io](https://draw.io)).  PowerPoint, Keynote, or LibreOffice may be the most convenient due to availability.  Make sure to
properly label the diagram including states, transitions, and actions.  See instructions for submission of FSMs.

Click the link below to watch the video that shows how to draw an FSM in PowerPoint and Keynote.

<a href="https://delawarestateuniversity-my.sharepoint.com/:v:/g/personal/mrasamny_desu_edu/EbMTuLeUZs1Di7VlgmAkz_sBg_8JuFAQBPiDEZi5Zvl_bQ?download=1">Drawing FSM</a>

## Implement Method
Implement the finite-state machine designed above in the SkillBuilder4 class method called

<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:blue;font-weight:bold;">
public static String findTYPattern(String s)
</p>

The function returns the first substring that starts with a <span style="color:rgb(172,86,0);">**t**</span> or 
<span style="color:rgb(172,86,0);">**T**</span> and ends with a 
<span style="color:rgb(172,86,0);">**y**</span> or <span style="color:rgb(172,86,0);">**Y**</span>; 
otherwise it returns an empty string.  For example, 

```java
SkillBuilder4.findTYPattern("Hello, my name is Tom Brady and I am thirsty")
```

should return the string <span style="color:red;font-family: 'courier new', courier;font-weight:bold;">Tom Brady</span>.

# 3. Submission of FSM and Implementation

The FSM should be in a pdf document called **fsm.pdf**.  You are required to submit th **SkillBuilder4.java** and **fsm.pdf** files on CodeGrade.