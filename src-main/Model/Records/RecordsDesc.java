package Model.Records;

interface RecordsDesc {
    void delete_records(int client_id);
    void update_records(int client_id);
    void display_records(int client_id);
    void display_status(int client_id);       
}
