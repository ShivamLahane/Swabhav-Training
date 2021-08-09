// create a student class.

class Student
{
    constructor(name, rollNo, cgpa)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
}

// create a student class analyser.

class StudentAnalyser
{
    constructor(studentArray)
    {
        this.studentList = studentArray;
    }

    getAvgCgpa()
    {
        var sum  = 0;
        for (var i = 0; i < this.studentList.length; i++)
        {
            sum += this.studentList[i].cgpa;
        }
        return sum / studentList.length;
    }

    getMaxCgpaStudent()
    {
        var student = null;
        var max = Number.MIN_VALUE;
        for (var i = 0; i < studentList.length; i++)
        {
            if (this.studentList[i].cgpa > max)
            {
                max = this.studentList[i].cgpa;
                student = this.studentList[i];
            }
        }
        return student;
    }

    getMinCgpaStudent()
    {
        var student = null;
        var min = Number.MAX_VALUE;
        for (var i = 0; i < studentList.length; i++)
        {
            if (this.studentList[i].cgpa < min)
            {
                min = this.studentList[i].cgpa;
                student = this.studentList[i];
            }
        }
        return student;
    }
}

// initialize a student array.
var studentList = [];

// adding student objects to array.
studentList.push(new Student("Shivam", 10, 7));
studentList.push(new Student("Nikhil", 12, 8));
studentList.push(new Student("Gaurav", 14, 9));
studentList.push(new Student("Gayatri", 16, 9));
studentList.push(new Student("Omkar", 18, 10));

//  initialzing analyser by passing student list.
var analyser = new StudentAnalyser(studentList);

// get results
console.log("average cgpa : " + analyser.getAvgCgpa());
console.log("max cgpaq student details : " + analyser.getMaxCgpaStudent().name);
console.log("min cgpa student details : " + analyser.getMinCgpaStudent().name);