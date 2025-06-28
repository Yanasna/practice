using UnityEngine;

public class Player_Move : MonoBehaviour
{
    // Start is called once before the first execution of Update after the MonoBehaviour is created
  public float moveSpeed = 50f;
  public Transform playerBody; // 큐브 또는 캐릭터
  public float mouseSensitivity = 100f;
     void Start()
    {
        Cursor.lockState = CursorLockMode.Locked; // 마우스 커서 고정
    }
    void Update()
    {
        float h = Input.GetAxis("Horizontal"); // A/D 또는 ← →
        float v = Input.GetAxis("Vertical");   // W/S 또는 ↑ ↓

        Vector3 dir = new Vector3(h, 0, v); // x축(h), y축은 안 쓰고, z축(v)
        transform.Translate(dir * moveSpeed * Time.deltaTime);

        float mouseX = Input.GetAxis("Mouse X") * mouseSensitivity * Time.deltaTime;
 

        // 좌우 회전 (플레이어 Y축 기준)
        playerBody.Rotate(Vector3.up * mouseX);
    }
}
