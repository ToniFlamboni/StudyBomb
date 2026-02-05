# StudyRush (WIP)
## Overview
StudyRush is a productivity timer designed to help users stay on track with their tasks. When the timer runs out, *StudyRush will delete a user-specified directory as a consequence, adding an extra layer of motivation!*
- Important note: **StudyRush will also delete all subdirectories!**

## Key Features
- **Productivity Timer**: Set a time before the selected file is deleted. To facilitate productivity, this timer _cannot normally be paused._
- **Task List** - Create a list of tasks. To stop the timer and prevent file deletion, all tasks must be completed.
  - Create subtasks within tasks. To clear the task, all subtasks must be completed.
  
- **Safety Mechanisms**: 
  - Confirmation prompts before timer begins.
  - An optional toggle to enable cancellation of the timer.
    
## How to Use
1. Download the executable from [Releases](https://github.com/ToniFlamboni/StudyRush/releases)
2. Create a list of tasks/subtasks you'd like to get done.
3. Allocate an appropriate amount of time, and set a directory for deletion.
4. Press the start button, and get to work!

## Implementation Plans
Currently, this software is a work-in-progress. The functionality included currently includes a working timer, task creation system, and implemented file deletion systems. However, the timer can be cancelled at any time and does not currently rely on the completion status of the tasks. Future improvements made will include:
* Locking the release of the timer to task completion
* Improved UI tidiness
* Improved subtask implementation
