//Câu 1:
//Nếu người dùng chọn "Cancel", mã sẽ hiển thị thông báo “You’ve choosen: No" vì điều kiện option ==JOptionPane.YES_OPTION sai. 
// Câu 2:
//Sử dụng phương thức showOptionDialog thay vì showConϐirmDialog --> cho phép chỉ định các tùy chọn nút tùy chỉnh.
// ==> sửa mã để cung cấp các tùy chọn tùy chỉnh "Yes" - "No" hoặc "I do" - "I don’t": 


import javax.swing.JOptionPane;
public class ChooseOption {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You've choosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}