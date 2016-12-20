/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementasi;
import cinterfase.cinterface;
import koneksi.koneksi;
import model.model;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author microsoft
 */
public class kelassaya implements cinterface {

    @Override
    public model simpan(model o) throws SQLException {
         PreparedStatement st = (PreparedStatement) 
    koneksi.KoneksiDatabase().prepareStatement("INSERT INTO tabel_teman VALUES(?,?,?,?,?)");
    st.setString(1,o.getId());
    st.setString(2,o.getNama());
    st.setString(3,o.getNohp());
    st.setString(4,o.getEmail());
    st.setString(5,o.getAlamat());
    st.executeUpdate();
    return o; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hapus(String id) throws SQLException {
       PreparedStatement st = (PreparedStatement)
   koneksi.KoneksiDatabase().prepareStatement("DELETE FROM tabel_teman WHERE id = ?");
      st.setString(1, id);
    st.executeUpdate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(model o) throws SQLException {
   com.mysql.jdbc.PreparedStatement st = (com.mysql.jdbc.PreparedStatement)
   koneksi.KoneksiDatabase().prepareStatement("UPDATE tabel_teman SET nama = ?, nomorhp = ?, email= ?, alamat= ? WHERE id = ?");
    st.setString(1,o.getNama());
    st.setString(2,o.getNohp());
    st.setString(3,o.getEmail());
    st.setString(4,o.getAlamat());
    st.setString(5,o.getId());
    st.executeUpdate(); //To change body of generated methods, choose Tools | Templates.        
    }

    @Override
    public List<model> tampil() throws SQLException {
       Statement stm = (Statement) koneksi.KoneksiDatabase().createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM tabel_teman");
        List <model> Listteman = new ArrayList<>();
        while (rst.next()){
        model teman = new model();
        teman.setId(rst.getString("id_teman"));
        teman.setNama(rst.getString("nama"));
        teman.setNohp(rst.getString("no_hp"));
        teman.setEmail(rst.getString("email"));
        teman.setAlamat(rst.getString("alamat"));
        Listteman.add(teman);
        }
        return Listteman; //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
