using TMPro;
using UnityEngine;
using UnityEngine.UI;
public class NPC_Interaction : MonoBehaviour
{
    // Start is called once before the first execution of Update after the MonoBehaviour is created
    public Camera cam;                   // Main Camera
    public Text objectNameText;         // UI Text
    public float rayDistance = 100f;    // Ray 거리
    public LayerMask interactableLayer; // 상호작용 가능한 오브젝트만
    // Update is called once per frame
    void Update()
    {
        Ray ray = cam.ScreenPointToRay(Input.mousePosition);

        if (Physics.Raycast(ray, out RaycastHit hit, rayDistance, interactableLayer))
        {
            objectNameText.text = hit.collider.gameObject.name;
            objectNameText.enabled = true;
        }
        else
        {
            objectNameText.enabled = false;
        }
    }
}
