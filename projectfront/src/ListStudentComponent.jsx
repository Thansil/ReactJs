
import React, { Component } from 'react';
import StudentService from './StudentService';

class ListStudentComponent extends Component {
    constructor() {
        super();
        this.state = {
            students: []
        }
        
        this.deleteStudents = this.deleteStudents.bind(this);
    }
    deleteStudents(id){
        StudentService.deleteStudents(id).then( res => {
            this.setState({students: this.state.student.filter(student => student.id !== id)});
        });
    }
    componentDidMount() {
        StudentService.getStudents().then((res) => {
            this.setState({ students: res.data });
        }
        );
    }

    render() {
        return (
            <div>
                <h2 className="text-center"> Student List</h2>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <tbody>
                            <tr>
                                   <th>Student id</th>
                                <th>Student First Name</th>
                                <th>Student Last Name</th>
                                <th>Student Email Id</th>
                                
                                
                            </tr>
                        </tbody>
                        <tbody>
                            {
                                this.state.students.map(
                                    students =>
                                        <tr >
                                            <td> {students.id}</td>
                                            <td> {students.firstName} </td>
                                            <td> {students.lastName} </td>
                                            <td> {students.emailId} </td>
                                            
                                        
                                        </tr>
                                )
                            }
                        </tbody>
                    </table>

                </div>
            </div>
        );
    }
}

export default ListStudentComponent;
